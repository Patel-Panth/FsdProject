import axios from 'axios';
import React, { Fragment, useEffect, useState } from 'react';
import { Button, Container, Form, FormGroup, Input } from 'reactstrap';
import base_url from '../api/bootapi';
import { toast } from 'react-toastify';

function AddCourses() {
    useEffect(() => {
        document.title = "Add Courses";
    }, []);

    const [course, setCourse] = useState({});

    const handleForm = (e) => {
        e.preventDefault();
        postDatatoServer(course);
    };

    const postDatatoServer = (data) => {
        axios.post(`${base_url}/courses`, data)
            .then((response) => {
                console.log(response);
                toast.success("Course added successfully");
            })
            .catch((error) => {
                console.log(error);
                toast.error("Course not added");
            });
    };

    return (
        <div>
            <Fragment>
                <h1 className='text-center my-3'>Fill Course Detail</h1>
                <Form onSubmit={handleForm}>
                    <FormGroup>
                        <label htmlFor="userId">Course Id</label>
                        <Input type='text'
                            placeholder='Enter here'
                            name='userId'
                            id='userId'
                            onChange={(e) => {
                                setCourse({ ...course, id: e.target.value });
                            }}
                        />
                    </FormGroup>
                    <FormGroup>
                        <label htmlFor='title'>Course Title</label>
                        <Input type='text' placeholder='Enter title Here'
                            name='title'
                            id='title'
                            onChange={(e) => {
                                setCourse({ ...course, title: e.target.value });
                            }} />
                    </FormGroup>
                    <FormGroup>
                        <label htmlFor="description">Course Description</label>
                        <Input type='textarea'
                            placeholder='Enter description here'
                            id='description'
                            onChange={(e) => {
                                setCourse({ ...course, description: e.target.value });
                            }}
                            style={{ height: 150 }}
                        />
                    </FormGroup>
                    <Container className='text-center'>
                        <Button color="success" type='submit'>Add Courses</Button>
                        <Button type='reset' color='warning m1-2' onClick={() => {
                            setCourse({ id: "", title: "", description: "" });
                        }}>Clear</Button>
                    </Container>
                </Form>
            </Fragment>
        </div>
    );
}

export default AddCourses;
