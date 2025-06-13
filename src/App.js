import logo from './logo.svg';
import './App.css';
// import Form from './login2.js';
// import Registration from './registration.js';
import Sviet from './sviet.js';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={"https://www.sviet.edu.in/wp-content/uploads/2023/05/SVIET-LOGO-Edited.png"}className="App-logo" alt="logo" />
        <p>
          Sri Vasavi Institute Of Engineering And Technology
        </p>
        <a
          className="App-link"
          href="https://www.sviet.edu.in/"
          target="_blank"
          rel="noopener noreferrer"
        >
          sviet login
        </a> 
        {/* <Form/> 
        <Registration/> */}
        <Sviet title="Empowering minds..."/>
        
      </header>
    </div>
  );
}

export default App;
