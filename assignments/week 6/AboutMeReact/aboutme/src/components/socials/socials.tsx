import React from "react";

interface SocialProps{
    hrefname: string,
    itemname: string
}

class Socials extends React.Component<SocialProps> {
    render() {
        return (
            <ul>
            <li className="sociallink">
                <a href={this.props.hrefname} target="_blank" rel="noreferrer">{this.props.itemname}</a>
            </li>
            <br></br>
        </ul>
        )
    }
}

export default Socials