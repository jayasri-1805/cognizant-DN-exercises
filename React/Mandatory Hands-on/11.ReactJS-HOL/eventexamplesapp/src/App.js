import React,{useState} from 'react';
export default function App(){
const[c,setC]=useState(0);const[r,setR]=useState('');const[e,setE]=useState('');
const hello=()=>alert('Hello! Static Message');
const inc=()=>{setC(c+1);hello();}
const dec=()=>setC(c-1);
const welcome=(m)=>alert(m);
const click=()=>alert('I was clicked');
const convert=()=>setE((parseFloat(r||0)/90).toFixed(2));
return <div style={{padding:20}}>
<h2>Counter:{c}</h2>
<button onClick={inc}>Increment</button>
<button onClick={dec}>Decrement</button><br/><br/>
<button onClick={()=>welcome('Welcome')}>Say Welcome</button><br/><br/>
<button onClick={click}>OnPress</button><br/><br/>
<h3>Currency Convertor</h3>
<input value={r} onChange={x=>setR(x.target.value)} placeholder='INR'/>
<button onClick={convert}>Convert</button>
<p>Euro: {e}</p>
</div>}
