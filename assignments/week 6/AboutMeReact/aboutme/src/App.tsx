import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import './App.css';
import Contact from './components/contact/contact.component';
import Footer from './components/footer/footer.component';
import Header from './components/header/header.component';
import Home from './components/home/home.component';
import Nav from './components/nav/nav.component';
import logo from './logo.svg';

function App() {
  return (
    <>
    <Header />
    <BrowserRouter>
      <Nav />
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/contact' element={<Contact />} />
      </Routes>
    </BrowserRouter>
    <Footer />
    </>
  );
}

export default App;
