import React from 'react'
import { Text } from '../Types'

export default function ListItem({text, number}: Text) {
    return (
        <div className={`flex items-center ${number === "1" ? `` : "mt-4"}`}>
            <div className="bg-purple rounded-full h-12 w-12 flex justify-center items-center mr-2"><p>{number}</p></div>
            <p className="text-xl ">{text}</p>
        </div>
    )
}
