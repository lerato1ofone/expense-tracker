import React from 'react'
import Logo from '../icons/Logo'
import Separator from '../icons/Separator'

export default function Navigation() {
    return (
        <nav className="font-logo relative flex justify-between items-center p-6 w-800 w-11/12 m-auto">
            <div className="flex items-center">
                    <Logo />
                    <a href="/" className="font-semibold text-xl pl-3 tracking-wider origin-left transform ease-in-out duration-500 hover:opacity-50 hover:scale-105">Xpensetrail.</a>
            </div>

            <div className="flex items-center">
                <div className="flex justify-center items-center text-sm bg-dark-purple text-light-white tracking-wide py-2 px-4 rounded">
                    <a href="/login" className="block origin-cente lg:inline-block pl-4 pr-6 transform ease-in-out duration-500 hover:text-white hover:scale-150 sm:hidden md:block">
                        Login
                    </a>
            
                    <Separator />
            
                    <a href="/register" className="block origin-center lg:inline-block text-teal-200 ml-5 pr-2 transform ease-in-out duration-500 hover:text-white hover:scale-125 sm:ml-0 sm:pl-2 md:ml-5">
                        Register
                    </a>
                </div>
                <div className="block ml-4 md:hidden lg:hidden">
                    <button className="flex items-center px-3 py-2 border rounded text-teal-200 border-teal-400 hover:opacity-50 hover:border-opacity-50">
                    <svg className="fill-current h-4 w-3" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><title>Menu</title><path d="M0 3h20v2H0V3zm0 6h20v2H0V9zm0 6h20v2H0v-2z"/></svg>
                    </button>
                </div>
            </div>
        </nav>
    )
}