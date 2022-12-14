import React from 'react';

import { Fragment, useState } from 'react';
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

import Navbar from '../dashboard/Navbar';
import ClaimList from './ClaimList';
import UserPoliciesList from './UserPoliciesList';
import PaymentList from './PaymentList';
import UserDetails from './UserDetails';


export const UserInfoMenu = () => {

    const [element, setData] = useState({
        activeItem: "Profile",
    });

    const { activeItem } = element;

    const handleClick = (e) => {
        setData({
            activeItem: e.target.innerText,
        });
        console.log(e.target.innerText);
        // console.log(e.target.getAttribute('name'));
        // console.log(activeItem);
    };

    return (
        <Container style={{ marginTop: "8rem", marginLeft: "10rem" }}>
            <Menu style={{ paddingRight: "10rem" }} secondary size="large">
                <Menu.Item
                    name="myProfile"
                    active={activeItem === "Profile"}
                    onClick={handleClick}
                    style={{ paddingRight: "5rem" }}
                >
                    <Button style={{
                        backgroundColor: "#4CAF50", border: "none", color: "white", padding: "15px 32px", textAlign: "center", textDecoration: "none",
                        display: "inline-block",
                        fontSize: "16px",
                        margin: "4px 2px",
                        cursor: "pointer"
                    }}>Profile</Button>
                </Menu.Item>
                <Menu.Item
                    name="myClaim"
                    active={activeItem === "Claim"}
                    onClick={handleClick}
                    style={{ paddingRight: "5rem" }}
                >
                    <Button style={{
                        backgroundColor: "#21AF50", border: "none", color: "white", padding: "15px 32px", textAlign: "center", textDecoration: "none",
                        display: "inline-block",
                        fontSize: "16px",
                        margin: "4px 2px",
                        cursor: "pointer"
                    }}>Claim</Button>

                </Menu.Item>
                <Menu.Item
                    name="myPolicy"
                    active={activeItem === "Policy"}
                    onClick={handleClick}
                    style={{ paddingRight: "5rem" }}
                >
                    <Button style={{
                        backgroundColor: "#4CAF50", border: "none", color: "white", padding: "15px 32px", textAlign: "center", textDecoration: "none",
                        display: "inline-block",
                        fontSize: "16px",
                        margin: "4px 2px",
                        cursor: "pointer"
                    }}>Policy</Button>
                </Menu.Item>
                <Menu.Item
                    name="myPayment"
                    active={activeItem === "Payment"}
                    onClick={handleClick}
                    style={{ paddingRight: "5rem" }}
                >
                    <Button style={{
                        backgroundColor: "#4CAF50", border: "none", color: "white", padding: "15px 32px", textAlign: "center", textDecoration: "none",
                        display: "inline-block",
                        fontSize: "16px",
                        margin: "4px 2px",
                        cursor: "pointer"
                    }}>Payment</Button>
                </Menu.Item>
            </Menu>

            <Container>
                {activeItem === "Profile" &&
                    <UserDetails style={{ marginTop: "20rem" }} />
                }
            </Container>

            <Container>
                {activeItem === "Claim" &&
                    <ClaimList />
                }
            </Container>
            <Container>
                {activeItem === "Policy" &&
                    <UserPoliciesList />
                }
            </Container>
            <Container>
                {activeItem === "Payment" &&
                    <PaymentList />
                }
            </Container>

        </Container>
    )
}

export default UserInfoMenu;