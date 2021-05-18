import React from 'react';
import './App.css';
import Navigation from './components/Navigation';
import Hero from './components/Hero';
import Informational from './components/Informational';
import HowItWorks from './components/HowItWorks';

function App() {
  return (
    <div>
      <div className="bg-gradient-to-br from-purple via-light-white to-transaparent h-screen">
        <Navigation />
        <Hero />
      </div>

      <Informational />
      <HowItWorks />
    </div>
  );
}

export default App;