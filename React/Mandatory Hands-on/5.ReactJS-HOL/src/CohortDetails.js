import styles from "./CohortDetails.module.css";

export default function CohortDetails({cohort}){
 const headStyle={
   color:cohort.currentStatus==="Ongoing"?"green":"blue"
 };
 return(
  <div className={styles.box}>
    <h3 style={headStyle}>{cohort.name}</h3>
    <dl>
      <dt>Started On</dt>
      <dd>{cohort.startedOn}</dd>

      <dt>Current Status</dt>
      <dd>{cohort.currentStatus}</dd>

      <dt>Coach</dt>
      <dd>{cohort.coach}</dd>

      <dt>Trainer</dt>
      <dd>{cohort.trainer}</dd>
    </dl>
  </div>
 );
}
