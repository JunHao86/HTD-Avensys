import Regist from "./registration";
import {render} from "react-dom"


function App() {
  return (
    <div>
      <Regist/>
    </div>
  );
}


render(<App/>,document.getElementById("root"))