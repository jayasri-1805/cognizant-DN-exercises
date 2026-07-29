import React from 'react';
export default function ListofPlayers(){
const players=[
{name:'Rohit',score:90},{name:'Gill',score:82},{name:'Virat',score:77},
{name:'Rahul',score:65},{name:'Hardik',score:72},{name:'Jadeja',score:68},
{name:'Surya',score:88},{name:'Pant',score:55},{name:'Kuldeep',score:74},
{name:'Bumrah',score:80},{name:'Shami',score:69}
];
const low=players.filter(p=>p.score<70);
return(<div><h2>All Players</h2><ul>{players.map((p,i)=><li key={i}>{p.name} - {p.score}</li>)}</ul>
<h2>Players with score below 70</h2><ul>{low.map((p,i)=><li key={i}>{p.name} - {p.score}</li>)}</ul></div>);
}