import React from 'react'
import HeroIcon from '../icons/HeroIcon'

export default function Hero() {
    return (
        <div className="font-body h-4/5 flex items-center justify-between w-4/5 m-auto lg:flex-row ls:justify-evenly sm:flex-col sm:justify-evenly">
            <div className="">
                <div className="relative w-2/4 md:w-3/4 sm:w-3/4">
                    <h1 className="font-bold text-6xl mb-6 tracking-wide leading-tight md:text-5xl sm:text-3xl">Redefine how you spend your rands.</h1>
                    <div className="absolute -inset-y-6 -inset-x-12 sm:-inset-y-10 sm:-inset-x-10 ls:-inset-y-10 ls:-inset-x-10">
                        <svg className="lg:w-72 h-28 md:w-72 sm:w-48 ls:w-48" width="410" height="120" viewBox="0 0 367 95" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <path d="M329.241 14.5032C323.21 14.3031 317.677 12.5643 311.666 12.4117C301.271 12.1478 290.978 11.206 280.634 10.3202C270.079 9.4164 259.326 8.22873 248.71 8.22873C220.769 8.22873 192.827 8.22873 164.885 8.22873C141.031 8.22873 117.373 7.57059 93.6911 9.79735C80.2767 11.0587 63.051 11.6437 51.126 17.6985C45.7783 20.4138 39.4952 22.1259 33.894 24.4959C27.4875 27.2066 21.9348 32.3199 16.5934 36.2315C8.50775 42.1527 3 46.8519 3 56.333C3 61.6697 5.16512 65.2638 10.6892 68.0686C16.8842 71.2141 26.3289 75.314 33.4135 76.2022C55.8664 79.0171 77.5028 85.5077 100.007 88.2283C145.649 93.7459 188.733 89.5956 234.792 91.8884C249.046 92.5979 279.226 89.7518 293.404 88.2283C307.649 86.6975 338.423 80.5283 338.423 80.5283C338.423 80.5283 356.29 70.8309 356.977 69.4049C362.64 57.6419 369.761 45.7228 356.29 35.36C347.27 28.421 336.073 23.8159 325.602 18.6862C315.566 13.7691 305.023 9.82673 293.404 8.46112C278.219 6.67644 263.763 6.1409 248.916 3" stroke="#FF7171" stroke-width="6" stroke-linecap="round"/>
                        </svg>
                    </div>
                </div>
                <div className="w-2/4 md:w-full sm:w-full">
                    <p className="text-xl mb-6 font-semibold md:text-base sm:text-base">Keep an eye on where your money is going so you can make better decisions for your finances.</p>
                </div>
                <button className="bg-green p-3 rounded font-semibold text-white tracking-wide">Get started</button>
            </div>
            <HeroIcon />
        </div>
    )
}