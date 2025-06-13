import logo from './logo.svg';
import './App.css';
import Intro from './intro.js';
function App() {
  return (
    <div className="App">
      <div>
        <form>
         <h3 align="center">LOGIN PAGE</h3>
         <table align="center" cellspacing="20px">
          <tr>
            <td><input type="email" placeholder="email"></input></td>
          </tr>
        <tr>
            <td><input type="text" placeholder="password"></input></td>
        </tr>
        <tr>
            <td><button align="center" type="submit">login</button> </td>
        </tr>
         </table>  
        </form>
    </div>
    </div>
  );
}

export default App;
