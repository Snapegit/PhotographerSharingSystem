import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import zuopinleibieList from '../pages/zuopinleibie/list'
import zuopinleibieDetail from '../pages/zuopinleibie/detail'
import zuopinleibieAdd from '../pages/zuopinleibie/add'
import zuopinxinxiList from '../pages/zuopinxinxi/list'
import zuopinxinxiDetail from '../pages/zuopinxinxi/detail'
import zuopinxinxiAdd from '../pages/zuopinxinxi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import friendlinkList from '../pages/friendlink/list'
import friendlinkDetail from '../pages/friendlink/detail'
import friendlinkAdd from '../pages/friendlink/add'
import onlinemessageList from '../pages/onlinemessage/list'
import onlinemessageDetail from '../pages/onlinemessage/detail'
import onlinemessageAdd from '../pages/onlinemessage/add'
import discusszuopinxinxiList from '../pages/discusszuopinxinxi/list'
import discusszuopinxinxiDetail from '../pages/discusszuopinxinxi/detail'
import discusszuopinxinxiAdd from '../pages/discusszuopinxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'zuopinleibie',
					component: zuopinleibieList
				},
				{
					path: 'zuopinleibieDetail',
					component: zuopinleibieDetail
				},
				{
					path: 'zuopinleibieAdd',
					component: zuopinleibieAdd
				},
				{
					path: 'zuopinxinxi',
					component: zuopinxinxiList
				},
				{
					path: 'zuopinxinxiDetail',
					component: zuopinxinxiDetail
				},
				{
					path: 'zuopinxinxiAdd',
					component: zuopinxinxiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'friendlink',
					component: friendlinkList
				},
				{
					path: 'friendlinkDetail',
					component: friendlinkDetail
				},
				{
					path: 'friendlinkAdd',
					component: friendlinkAdd
				},
				{
					path: 'onlinemessage',
					component: onlinemessageList
				},
				{
					path: 'onlinemessageDetail',
					component: onlinemessageDetail
				},
				{
					path: 'onlinemessageAdd',
					component: onlinemessageAdd
				},
				{
					path: 'discusszuopinxinxi',
					component: discusszuopinxinxiList
				},
				{
					path: 'discusszuopinxinxiDetail',
					component: discusszuopinxinxiDetail
				},
				{
					path: 'discusszuopinxinxiAdd',
					component: discusszuopinxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
