import React, { Component, Fragment } from 'react'
import { makeStyles } from '@material-ui/core/styles';
import { Link } from "react-router-dom";
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import IconButton from '@material-ui/core/IconButton';
import Button from '@material-ui/core/Button';
import MenuIcon from '@material-ui/icons/Menu';


class Navbar extends Component {
    constructor(props){
        super(props);
        this.state = {
            "token": "",
        }

        if(localStorage.getItem("token")){
            console.log(localStorage.getItem("token"));
            this.setState({token: localStorage.getItem("token")});  
        }
    }

    updateStorage(e){
        if(localStorage.getItem("token")){
            localStorage.removeItem("token");
            this.setState({token: ""});  
        }else{
            this.setState({token: localStorage.getItem("token")}); 
        }
    }

    render() {
    const authLinks = (
        <Fragment className="container-fluid">
        <h1>
                <Link to="/">Dashboard</Link>
            </h1>
        <ul>
          <li>
            <Link onClick={e => this.updateStorage(e)} to="/">
              <span className="hide-sm">Logout</span>
            </Link>
          </li>
          {/* <li>
              <Link to="/myPoliciesList">All Policies </Link>
          </li>
          <li>
              <Link to="/myClaimsList">All Claims </Link>
          </li> */}
          <li>
              <Link to="/menuItems">My Profile </Link>
          </li>
        </ul>
        {console.log("authLinks")}
        </Fragment>
      );
    
       const guestLinks = (
        <Fragment className="container-fluid">
        <h1>
                <Link to="/">Dashboard</Link>
            </h1>
        <ul>
          <li>
            <Link onClick={e => this.updateStorage(e)} to="/loginClass">Login</Link>
          </li>
          <li>
            <Link onClick={e => this.updateStorage(e)} to="/registerClass">Register</Link>
          </li>
          <li>
            <Link to="/carousel">Policies</Link> 
          </li>
          <li>
            <Link  to="/navTrial">NavTrial</Link>
          </li>
        </ul>
        {console.log("guestLinks")}
        </Fragment>
      );


    return (
      
        <nav className="navbar navbar-inverse">
            {this.state.token==="" ?
                guestLinks: authLinks
            }
        </nav>
        
    )
    }
}

export default Navbar;