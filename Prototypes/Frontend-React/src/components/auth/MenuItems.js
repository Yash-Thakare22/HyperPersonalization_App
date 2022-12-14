import React from 'react';

import { Fragment, useState} from 'react';
import { Link } from 'react-router-dom';
import {
    Grid,
    Container,
    Search,
    Form,
    Button,
    Header,
    Menu,
    Icon,
  } from "semantic-ui-react";

  import  Navbar  from '../dashboard/Navbar';
import ClaimList from '../User/ClaimList';
import UserPoliciesList from '../User/UserPoliciesList';


export const MenuItems = () => {

      const [element, setData] = useState({
        activeItem: "Profile",
      });

      const {activeItem} = element;
    
      const handleClick = (e) => {
        setData({
          activeItem: e.target.innerText,
        });
        console.log(e.target.innerText);
        // console.log(e.target.getAttribute('name'));
        // console.log(activeItem);
      };

    return (
        <Container>
            <Menu secondary size="large">
              
                <Menu.Item
                  name="myProfile"
                  active={activeItem === "Profile"}
                  onClick={handleClick}
                >
                  Profile
                </Menu.Item>
              
                <Menu.Item
                  name="myClaim"
                  active={activeItem === "Claim"}
                  onClick={handleClick}
                >
                  Claim
                </Menu.Item>
              
            </Menu>

            <Container>
                {activeItem==="Profile" &&
                    <UserPoliciesList />     
                }
            </Container>

            <Container>
                {activeItem==="Claim" &&
                    <ClaimList />     
                }
            </Container>
           

    </Container>
    )
}

export default MenuItems;