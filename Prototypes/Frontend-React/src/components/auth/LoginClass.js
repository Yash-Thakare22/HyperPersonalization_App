import React, { Component } from 'react';
import {
    Container,
    Form,
    Button
} from "semantic-ui-react";

import setAuthToken from '../../utils/utils';

class LoginClass extends Component {

    constructor(props){
        super(props);
        this.state = {
            "email": "",
            "password": ""
        }
    }

    handleSubmit(e){
        e.preventDefault();

    //     var myRequest = new Request(`http://localhost:8081/Anton/fetchAllPolicies`);
        
    
    // fetch(myRequest)
    //   .then((response) => response.json())
    //   .then((data) => {
    //     this.setState({ res: data });
    //   });

        // const res = fetch(``)
        console.log(this.state.username+" "+this.state.password);
        localStorage.setItem("token", this.state.email);
        return;
    }
    

    render() {
      return (
        <Container className="container-fluid">
            <h1>Login</h1>
            <Form onSubmit={e => this.handleSubmit(e)}>
                <Form.Field>
                    <label>UserName</label>
                    <input placeholder='EMAIL' name="email" value={this.state.username} onChange={e => this.setState({username: e.target.value})} />
                </Form.Field>
                <Form.Field>
                    <label>Password</label>
                    <input type="password" name="password" placeholder='PASSWORD' value={this.state.password} onChange={e => this.setState({password: e.target.value})} />
                </Form.Field>
                <Button type='submit'>Submit</Button>
            </Form>
        </Container>
      );
    }
}

export default LoginClass;