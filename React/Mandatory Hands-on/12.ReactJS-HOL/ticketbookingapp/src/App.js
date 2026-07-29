import React,{useState} from 'react';
function Guest(){return<div><h2>Guest Page</h2><p>Flight: Hyderabad to Delhi</p><p>Please login to book tickets.</p></div>}
function User(){return<div><h2>User Page</h2><p>Flight: Hyderabad to Delhi</p><button>Book Ticket</button></div>}
export default function App(){
const[logged,setLogged]=useState(false);
return<div style={{padding:20}}>
<h1>Ticket Booking App</h1>
{logged?<button onClick={()=>setLogged(false)}>Logout</button>:<button onClick={()=>setLogged(true)}>Login</button>}
{logged?<User/>:<Guest/>}
</div>}
