import React from 'react';
export default function IndianPlayers(){
const team=['Rohit','Gill','Virat','Rahul','Hardik','Jadeja'];
const [p1,p2,p3,p4,p5,p6]=team;
const odd=[p1,p3,p5], even=[p2,p4,p6];
const t20=['Rohit','Surya','Hardik'];
const ranji=['Pujara','Rahane','Sarfaraz'];
const merged=[...t20,...ranji];
return(<div><h2>Odd Team</h2><ul>{odd.map((p,i)=><li key={i}>{p}</li>)}</ul>
<h2>Even Team</h2><ul>{even.map((p,i)=><li key={i}>{p}</li>)}</ul>
<h2>Merged Players</h2><ul>{merged.map((p,i)=><li key={i}>{p}</li>)}</ul></div>);
}