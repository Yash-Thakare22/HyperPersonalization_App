import React, { useState } from "react";
import { makeStyles } from "@material-ui/core/styles";
import AppBar from "@material-ui/core/AppBar";
import Toolbar from "@material-ui/core/Toolbar";
import Typography from "@material-ui/core/Typography";
import IconButton from "@material-ui/core/IconButton";
import MenuIcon from "@material-ui/icons/Menu";
import green from "@material-ui/core/colors/green";
import {Link} from "react-router-dom";

// react.school/material-ui

const useStyles = makeStyles((theme) => ({
  menuButton: {
    marginRight: theme.spacing(2)
  },
  title: {
    flexGrow: 1
  },
  customColor: {
    // or hex code, this is normal CSS background-color
    backgroundColor: green[500]
  },
  customHeight: {
    minHeight: 200
  },
  offset: theme.mixins.toolbar
}));

export default function ButtonAppBar() {
  const classes = useStyles();
  const [example, setExample] = useState("primary");
  const isCustomColor = example === "customColor";
  const isCustomHeight = example === "customHeight";
  return (
    <React.Fragment>
      <AppBar
        color={isCustomColor || isCustomHeight ? "primary" : example}
        className={`${isCustomColor && classes.customColor} ${
          isCustomHeight && classes.customHeight
        }`}
      >
        <Toolbar style={{flexGrow: 1}}>
          <IconButton
            edge="start"
            className={classes.menuButton}
            color="inherit"
            aria-label="menu"
          >
            <MenuIcon />
          </IconButton>
          <Typography variant="h6" className={classes.title}>
            SwiftInsure
          </Typography>
          <IconButton color="inherit" onClick={() => setExample("secondary")}>
            <Link style={{color:"white", textDecoration:"none"}} to="/explore">Explore</Link>
          </IconButton>
          <IconButton color="inherit" onClick={() => setExample("secondary")}>
            <Link style={{color:"white", textDecoration:"none"}} to="/userInfo">Profile</Link>
          </IconButton>
          <IconButton color="inherit" onClick={() => setExample("secondary")}>
            <Link style={{color:"white", textDecoration:"none"}} to="/signIn">SignIn</Link>
          </IconButton>
          <IconButton color="inherit" onClick={() => setExample("secondary")}>
            <Link style={{color:"white", textDecoration:"none"}} to="/signUp">SignUp</Link>
          </IconButton>
        </Toolbar>
      </AppBar>
    </React.Fragment>
  );
}
