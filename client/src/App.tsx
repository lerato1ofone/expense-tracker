import React from 'react';
import './App.css';
import Navigation from './components/Navigation';
import Hero from './components/Hero';

function App() {
  return (
    <div className="bg-gradient-to-br from-purple via-light-white to-transaparent h-screen">
      <Navigation />
      <Hero />
    </div>
  );
}

export default App;