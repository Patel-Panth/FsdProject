import axios from 'axios'
import React from 'react'
import { Button, Card, CardBody, CardSubtitle, CardText, Container } from 'reactstrap'
import base_url from '../api/bootapi'

function  Courses({course ,update}) {
  const deleteCourse=(id)=>{
    axios.delete(`${base_url}/courses/${id}`).then(
      (response)=>{
        console.log(response);
        update();
      },
      (error)=>{
        console.log(error);
}    )
  }
  return (
    <Card className='text-center'>
        <CardBody>
            <CardSubtitle className='font-weight-bold'>{course.title}</CardSubtitle>
            <CardText>{course.description}</CardText>
            <Container className='text-center'>
                <Button color='danger' onClick={()=>{
                  deleteCourse(course.id);
                }}>Delete</Button>
                <Button color='warning ml-3'>Update</Button>
            </Container>
        </CardBody>
    </Card>
  )
}

export default Courses