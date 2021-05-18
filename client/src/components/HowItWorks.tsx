import React from 'react'
import Computer from '../icons/Computer'
import Title from './Title'

export default function HowItWorks() {
    return (
        <div className="font-body">
            <div className="text-center">
                <Title text="How it works"/>
            </div>
            <div>
                <div>
                    <div>
                        <div></div>
                        <p>Register your account, and sign into your account.</p>
                    </div>
                    <div>
                        <div></div>
                        <p>Define some categories, or add a transaction directly.</p>
                    </div>
                    <div>
                        <div></div>
                        <p>See how much your are spending..</p>
                    </div>
                    <div>
                        <div></div>
                        <p>Curate a budget and tailer your spending to meet your needs.</p>
                    </div>
                </div>
                <Computer />
            </div>
        </div>
    )
}