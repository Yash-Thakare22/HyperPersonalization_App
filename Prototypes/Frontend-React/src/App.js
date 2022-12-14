import { Component, Fragment } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Dashboard  from './components/dashboard/Dashboard';
import Register from './components/auth/Register';
import  LoginClass  from "./components/auth/LoginClass";
import SearchRecipes from './components/auth/SearchRecipes';
import PolicyCarousel from './components/auth/PolicyCarousel';
import UserPoliciesList from './components/User/UserPoliciesList';

// Redux imports
import { Provider } from 'react-redux';
import store from './store';
import Navbar  from './components/dashboard/Navbar';
import RegisterClass from './components/auth/RegisterClass';
import ClaimList from './components/User/ClaimList';
import MenuItems from './components/auth/MenuItems';
import TrialNav from "./components/dashboard/TrialNav";
import SignUp from './components/authenticate/SignUp';
import { Explore } from './components/Landing/Explore';
import UserInfoMenu from './components/User/UserInfoMenu';
import UserDetails  from './components/User/UserDetails';
import  PaymentList  from './components/User/PaymentList';
import SignIn from "./components/authenticate/SignIn";

class App extends Component{
  render(){
    return (
      <Router>
       <Fragment>
         {/* <Navbar /> */}
         <TrialNav style={{marginBottom:"10rem"}}/>
       <Switch>
              <Route exact path="/" component={Dashboard} />
              <Route exact path="/loginClass" component={LoginClass} />
              <Route exact path="/registerClass" component={RegisterClass} />
              <Route exact path="/carousel" component={PolicyCarousel} />
              <Route exact path="/myPoliciesList" component={UserPoliciesList} />
              <Route exact path="/myClaimsList" component={ClaimList} />
              <Route exact path="/menuItems" component={MenuItems} />
              <Route exact path="/navtrial" component={TrialNav} />
              <Route exact path="/signUp" component={SignUp} />
              <Route exact path="/signIn" component={SignIn} />
              <Route exact path="/explore" component={Explore} />
              <Route exact path="/userInfo" component={UserInfoMenu} />
              <Route exact path="/profile" component={UserDetails} />
              <Route exact path="/payment" component={PaymentList} />
          </Switch>
       </Fragment>
     </Router>
    )
  }
}

// const App = () => (
//     <Router>
//       <Fragment>
//         <Route exact path="/" component={Dashboard} />
//         <Route exact path="/login" component={LoginClass} />
//       </Fragment>
//     </Router>
// );

export default App;


