import React from 'react'
import { Container, Form, Checkbox, Button } from 'semantic-ui-react'
import { Navbar } from '../dashboard/Navbar';
import { useState } from 'react';

export const Login = () => {
    const [formData, setFormData] = useState({
        username: '',
        password: ''
    });

    const { username, password } = formData;

    const onChange = e => setFormData({ ...formData, [e.target.name]: e.target.value });

    const onSubmit = e => {
        e.preventDefault();

        console.log(formData);

        try {
            const config = {
                headers: {
                    "Content-Type": "application/json"
                }
            }

            const body = JSON.stringify(newUser);

            // const res = await axios.post('/api/users', body, config);
            // console.log(res);
        } catch (err) {
            console.log(err);
        }
    }

    return (
        <Container>
            <h1>Login</h1>
            <Form onSubmit={e => onSubmit(e)}>
                <Form.Field>
                    <label>UserName</label>
                    <input placeholder='UserName' name="username" value={username} onChange={e => onChange(e)} />
                </Form.Field>
                <Form.Field>
                    <label>Password</label>
                    <input type="password" name="password" placeholder='Password' value={password} onChange={e => onChange(e)} />
                </Form.Field>
                <Form.Field>
                    <Checkbox label='I agree to the Terms and Conditions' />
                </Form.Field>
                <Button type='submit'>Submit</Button>
            </Form>
        </Container>
    )
}
