import React from 'react'
import Computer from '../icons/Computer'
import Title from './Title'
import ListItem from './ListItem';

export default function HowItWorks() {
    return (
        <div className="h-screen font-body flex flex-col justify-center">
            <div>
                <h3>How it works</h3>
            </div>
            <div className="flex justify-center items-center lg:flex-row sm:flex-col">
                <div className="">
                    <ListItem number="1" text="Register your account, and sign into your account."/>
                    <ListItem number="2" text="Define some categories, or add a transaction directly."/>
                    <ListItem number="3" text="See how much your are spending."/>
                    <ListItem number="4" text="Curate a budget and tailer your spending to meet your needs."/>
                </div>
                <Computer />
            </div>
            
        </div>
    )
}