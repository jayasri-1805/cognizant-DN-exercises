import React,{useState} from 'react';
const Book=()=> <div><h2>Book Details</h2><p>React Guide</p></div>;
const Blog=()=> <div><h2>Blog Details</h2><p>Learning React.</p></div>;
const Course=()=> <div><h2>Course Details</h2><p>ReactJS Course</p></div>;
export default function App(){const[v,setV]=useState('book');
return <div style={{padding:20}}>
<button onClick={()=>setV('book')}>Book</button>
<button onClick={()=>setV('blog')}>Blog</button>
<button onClick={()=>setV('course')}>Course</button>
{v==='book'?<Book/>:v==='blog'?<Blog/>:<Course/>}
</div>}