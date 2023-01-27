
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AggManager from "./components/listers/AggCards"
import AggDetail from "./components/listers/AggDetail"

import GggManager from "./components/listers/GggCards"
import GggDetail from "./components/listers/GggDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/aggs',
                name: 'AggManager',
                component: AggManager
            },
            {
                path: '/aggs/:id',
                name: 'AggDetail',
                component: AggDetail
            },

            {
                path: '/gggs',
                name: 'GggManager',
                component: GggManager
            },
            {
                path: '/gggs/:id',
                name: 'GggDetail',
                component: GggDetail
            },



    ]
})
