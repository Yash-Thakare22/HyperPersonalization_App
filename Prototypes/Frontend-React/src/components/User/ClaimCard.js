import React from 'react';
import Card from '@material-ui/core/Card';
import CardContent from '@material-ui/core/CardContent';
import Typography from '@material-ui/core/Typography';
import CardActions from '@material-ui/core/CardActions';
import Button from '@material-ui/core/Button';
import { Divider, makeStyles } from '@material-ui/core';
import CardHeader from '@material-ui/core/CardHeader';

const useStyles = makeStyles(theme => ({
  root: {
    borderRadius: 12,
    minWidth: 256,
    maxWidth: 370,
    textAlign: 'center',
    borderColor: 'red',
    boxShadow: 'rgba(255, 0, 0, 0.117647) 0px 1px 6px, rgba(255, 0, 0, 0.117647) 0px 1px 4px',
    margin: 32,
  },
  header: {
    textAlign: 'center',
    spacing: 10,
  },
  list: {
    padding: '20px',
  },
  button: {
    margin: theme.spacing(1),
    bgcolor:'#b1c5e6'
  },
  action: {
    display: 'flex',
    justifyContent: 'space-around',
  },
}));

export const ClaimCard = ({claims, policies, claimStatusCode})=> {
  const classes = useStyles();
  return (
    <Card className={classes.root}>
      <CardHeader title={claimStatusCode.statusDescription} className={classes.header} />
      <Divider variant="middle" />
      <CardContent>
        <Typography variant="h4" align="center">
        ₹ {claims.amountOfClaim}
        </Typography>
        <Typography  align="center">
         Date: {claims.dateOfClaim.slice(0,10)} ID:{claims.claimId} 
        </Typography>
        <div className={classes.list}>
          <Typography align="center">Reason: {claims.detailsOfClaim}</Typography>
          <Typography align="center">for No: {policies.policyNo}</Typography>
          <Typography align="center"> {policies.policyRenewableType}</Typography>
        </div>
      </CardContent>
      <Divider variant="middle" />
      <CardActions className={classes.action}>
        <Button variant="contained" color="secondary" className={classes.button}>
          Cancel
        </Button>
      </CardActions>
    </Card>
  );
};

export default ClaimCard;