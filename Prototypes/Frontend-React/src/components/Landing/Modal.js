import React, { Fragment } from 'react';
import Button from '@material-ui/core/Button';
import TextField from '@material-ui/core/TextField';
import Dialog from '@material-ui/core/Dialog';
import DialogActions from '@material-ui/core/DialogActions';
import DialogContent from '@material-ui/core/DialogContent';
import DialogContentText from '@material-ui/core/DialogContentText';
import DialogTitle from '@material-ui/core/DialogTitle';


export default function Modal() {

  const [preferencesArray, setPreferencesArray] = React.useState([]); 
  const [open, setOpen] = React.useState(false);

  const handleClickOpen = () => {
    setOpen(true);
  };

  const handleClose = () => {
    setOpen(false);
  };

  const handleCheckboxChange = (event) => {
    if (event.target.checked) {
      if (!preferencesArray.includes(event.target.value)) {
        setPreferencesArray(preferencesArray=> [...preferencesArray, event.target.value])
      }
    } else {
        setPreferencesArray(preferencesArray=> preferencesArray.filter(p=> p!==event.target.value))
    }
  }

  const updatePreferences = () =>{
    preferencesArray.forEach(element => {
          // get user id from local storage
          // call add preference via POST method
        // POST (element.key, element.val)
        console.log(element);
      });

      let prefStr = JSON.stringify(preferencesArray);
      localStorage.setItem("prefStr", prefStr);
  }

  return (

         
  
    <div>
      <Button variant="outlined" color="primary" onClick={handleClickOpen}>
        Customize
      </Button>
      <Dialog open={open} onClose={handleClose} aria-labelledby="form-dialog-title">
        <DialogTitle id="form-dialog-title">Save Preferences</DialogTitle>
        <DialogContent>
          <DialogContentText>
            To subscribe to this website, please enter your email address here. We will send updates
            occasionally.
          </DialogContentText>
          
            <h5>Select your preference(s):</h5>
            <div class="custom-control custom-checkbox" >
              {
                ["VEHICLE", "MEDICAL","LIFE"].map(preference => {
                  return (
                    <div class="custom-control custom-checkbox">
                      <input type="checkbox" class="custom-control-input" id={preference} value={preference} onChange={handleCheckboxChange} />
                      <label class="custom-control-label" for={preference}> Are you looking to insure your {preference} ?</label>
                    </div>
                  )
                })
              }
            </div>
        </DialogContent>
        <DialogActions>
          <Button onClick={handleClose} color="primary">
            Cancel
          </Button>
          <Button onClick={updatePreferences} color="primary">
          Save Preferences
          </Button>
        </DialogActions>
      </Dialog>
    </div>
   
  );
}

