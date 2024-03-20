import React, { useEffect } from 'react';
import {Button, Container} from 'reactstrap'
function Home() {
  useEffect(()=>{
    document.title="Home";
  })
  return (
    <div>
       
            <h1>I am Panth</h1>
            <Container>
                <Button color='primary'>Start Wiht Me</Button>
            </Container>
      
    </div>
  )
}

export default Home