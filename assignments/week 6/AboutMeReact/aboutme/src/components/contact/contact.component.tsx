import './contact.component.css'

const Contact = () => {
    return(
        <div className="body-container">
        <div>
            <img src="https://i.gyazo.com/1c863bf93e7df665f1f9a73293ac51cd.png" alt="self"></img>
        </div>
        <div className="social">
            <h4>Find me below!</h4>
            <hr></hr>
            <ul>
                <li className="sociallink">
                    <a href="https://www.linkedin.com/in/iamcorywarden/" target="_blank" rel="noreferrer">LinkedIn</a>
                </li>
                <br></br>
                <li className="sociallink">
                    <a href="https://github.com/12cwarden" target="_blank" rel="noreferrer">Github</a>
                </li>
                <br></br>
                <li className="sociallink">
                    <a href="https://www.youtube.com/watch?v=dQw4w9WgXcQ" target="_blank" rel="noreferrer">Myspace</a>
                </li>
            </ul>
        </div>
    </div>
    )
}

export default Contact