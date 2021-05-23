import React from 'react'
import EyeIcon from '../icons/EyeIcon';
import LockIcon from '../icons/LockIcon';
import WalletIcon from '../icons/WalletIcon';
import Info from './../icons/Info';
import TransactionsIcon from './../icons/TransactionsIcon';

export default function Informational() {
    return (
        <div className="h-screen relative font-body">
            <div className="absolute -inset-0 z-0">
                <Info />
            </div>
            
            <div className="w-4/5 m-auto relative pt-28">
                <div>
                    <h2 className="font-bold text-4xl w-1/4 tracking-wide leading-tighter mb-6">Show your money who’s boss! </h2>
                    <p className="mb-6 font-semibold">See what expenses use up most of your money and fire those expenses if you wish, you are the boss afterall.</p>
                    <button className="bg-green p-3 rounded font-semibold text-white tracking-wide">Sign up. It’s free.</button>
                </div>
                <div className="flex flex-col items-center mt-12">
                    <h3 className="text-2xl font-semibold mb-6">Benefits</h3>
                    <p>Over half a million users like us. <span>&#8594;</span></p>
                    <div className="flex mt-12 break-words">
                        <div>
                            <LockIcon />
                            <p>Secure and reliable, only you get access to your account and make changes.</p>
                        </div>
                        <div>
                            <EyeIcon />
                            <p>See exactly where your money goes & keep track of it.</p>
                        </div>
                        <div>
                            <TransactionsIcon />
                            <p>Your transactions are organized in a categoried fashion.</p>
                        </div>
                        <div>
                            <WalletIcon />
                            <p>Don’t spend money to understand your money. Get everything for free.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}