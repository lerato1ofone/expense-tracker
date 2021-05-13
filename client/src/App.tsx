import React from 'react';
import './App.css';
import Navigation from './components/Navigation';
import Hero from './components/Hero';
import Informational from './components/Informational';

function App() {
  return (
    <div className="bg-gradient-to-br from-purple via-light-white to-transaparent h-screen">
      <Navigation />
      <Hero />
      <Informational />
    </div>
  );
}

export default App;