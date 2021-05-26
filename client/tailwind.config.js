module.exports = {
  purge: ['./src/**/*.{js,jsx,ts,tsx}', './public/index.html'],
  darkMode: false, // or 'media' or 'class'
  theme: {
    colors: {
      transparent: 'transparent',
      current: 'currentColor',
      purple: '#D0D5F2',
      'dark-purple': '#AB62FE',
      green: '#13C6B9',
      white: '#FFF',
      'dark-white': '#DFDFDF',
      'light-white': '#F2F3F9',
      'light-black': '#0D1117'
    },
    fontFamily: {
      sans: ['Graphik', 'sans-serif'],
      serif: ['Merriweather', 'serif'],
    },
    screens: {
      'sm': '500px',
      'ls': '636px',
      'md': '768px',     
      'lg': '1024px',
      'xl': '1280px',
      '2xl': '1536px',
    },
    extend: {
      spacing: {
        '128': '32rem'
      },
      fontFamily: {
        body: ['Montserrat', 'sans-serif'],
        logo: ['Poppins', 'sans-serif']
      }      
    },
  },
  variants: {
    extend: {
    },
  },
  plugins: [
  ],
}