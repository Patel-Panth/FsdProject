import React from 'react';
import './App.css';
import 'react-toastify/dist/ReactToastify.css'; // Update this line
import Header from "./components/Header.js";
import { Col, Container, Row } from 'reactstrap';

import Home from './components/Home.js';
import  { ToastContainer , toast} from "react-toastify"
import AddCourses from './components/AddCourses.js';
import Menus from './components/Menus.js';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Allcources from './components/Allcources.js';

function App() {
 
  return (
    <div className="App">
      
      <BrowserRouter>
      <ToastContainer/>
      <Header/>
      <Container>
        <Row>
          <Col md={4}>
              <Menus/>
          </Col>
          <Col md={8}>
            <Routes>
          <Route path='/' element={<Home />} exact/>
          <Route path='/add-course' element={<AddCourses />} exact/>
          <Route path='/view-courses' element={<Allcources/>} exact/>
        </Routes>
          </Col>
        </Row>
       </Container>
      </BrowserRouter>
     </div>
  );
}

export default App;
