import React from 'react'

type Text = {
    text: string
}

export default function Title({ text } :Text) {
    return (
        <h3 className="text-2xl font-semibold mb-6">{text}</h3>
    )
}