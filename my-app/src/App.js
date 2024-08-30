import React, {useEffect, useState} from 'react';
import './App.css';
import axios from 'axios';
function App() {
  const [message, setMessage] = useState('');
  useEffect(() => {
    axios.get('http://localhost:8081/api/hello')
    .then(response => {
      setMessage(response.data);
    })
    .catch(eeror => {
      alert("데이터를 가져올 수 없습니다.");
    })
  }, []);
  return (
    <div className="App">
      <header className="App-header">
        <p>{message}</p>
      </header>
    </div>
  );
}

export default App;
