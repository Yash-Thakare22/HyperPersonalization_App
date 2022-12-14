import React, { Component } from 'react';
import {
    Container,
    Form,
    Button
} from "semantic-ui-react";

import setAuthToken from '../../utils/utils';

class RegisterClass extends Component {

    constructor(props){
        super(props);
        this.state = {
            "email": "",
            "name": "",
            "password": "",
            "password2": ""
        }
    }

    handleSubmit(e){
        e.preventDefault();
        // const res = fetch(``)
        console.log(this.state.username+" "+this.state.password+" "+this.state.email);

        localStorage.setItem("token", this.state.username);
        return;
    }
    

    render() {
      return (
        <Container>
            <h1>Login</h1>
            <Form onSubmit={e => this.handleSubmit(e)}>
                <Form.Field>
                    <label>Email</label>
                    <input placeholder='Email' name="email" value={this.state.email} onChange={e => this.setState({email: e.target.value})} />
                </Form.Field>
                <Form.Field>
                    <label>UserName</label>
                    <input placeholder='UserName' name="username" value={this.state.username} onChange={e => this.setState({username: e.target.value})} />
                </Form.Field>
                <Form.Field>
                    <label>Password</label>
                    <input type="password" name="password" placeholder='Password' value={this.state.password} onChange={e => this.setState({password: e.target.value})} />
                </Form.Field>
                <Form.Field>
                    <label>Confirm Password</label>
                    <input type="password" name="password2" placeholder='Confirm Password' value={this.state.password2} onChange={e => this.setState({password2: e.target.value})} />
                </Form.Field>
                <Button type='submit'>Submit</Button>
            </Form>
        </Container>
      );
    }
}

export default RegisterClass;