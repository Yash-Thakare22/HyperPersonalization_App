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
  },
  action: {
    display: 'flex',
    justifyContent: 'space-around',
  },
}));

export const UserPolicyCard = ({policy, refPolicyTypes})=> {
  const classes = useStyles();
  return (
    <Card className={classes.root}>
      <CardHeader title={refPolicyTypes.policyTypeName} className={classes.header} />
      <Divider variant="middle" />
      <CardContent>
        <Typography variant="h4" align="center">
           {"Premium ₹ "+ policy.premiumAmount}
        </Typography>
        <br/>
        <Typography variant="h4" align="center">
        {" Total ₹ " + policy.finalAmount}
        </Typography>
        <br/>
        <Typography variant="p" align="center">
          {"START DATE "+ policy.dateRegistered.slice(0, 10)}
        </Typography>
        <br/>
        <Typography variant="p" align="center">
        {"END DATE "+ policy.endDate.slice(0, 10)}
        </Typography>
        <div className={classes.list}>
          <Typography align="center">Explore Benefits</Typography>
          <Typography align="center">Get personalized notes</Typography>
          <Typography align="center">Share / favorite quotes</Typography>
        </div>
      </CardContent>
      <Divider variant="middle" />
      <CardActions className={classes.action}>
        <Button variant="contained" color="primary" className={classes.button}>
          RENEW
        </Button>
      </CardActions>
    </Card>
  );
};

export default UserPolicyCard;