const offices=[
{name:'Sky Tower',rent:55000,address:'Hyderabad',image:'https://via.placeholder.com/300'},
{name:'Tech Park',rent:75000,address:'Bengaluru',image:'https://via.placeholder.com/300'}
];
export default function App(){
return(<div style={{padding:20}}>
<h1>Office Space Rental App</h1>
{offices.map((o,i)=><div key={i}>
<img src={o.image} alt='office'/>
<h2>{o.name}</h2>
<p style={{color:o.rent<60000?'red':'green'}}>Rent: {o.rent}</p>
<p>Address: {o.address}</p><hr/></div>)}
</div>);
}