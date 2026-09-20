<template>
<div class="home-preview" :style='{"margin":"0 auto","flexWrap":"wrap","flexDirection":"row","background":"none","display":"flex","width":"100%","justifyContent":"center"}'>

	<!-- 搜索 -->
	<div id="search" class="search animate__animated" :style='{"padding":"10px 10%","margin":"0px auto 0","borderColor":"#eee","alignItems":"center","textAlign":"center","display":"flex","justifyContent":"center","flexWrap":"wrap","background":"#fff","borderWidth":"0px","width":"100%","borderStyle":"solid","height":"auto","zIndex":"1002"}'>
		<div :style='{"margin":"0 10px 0 0","display":"inline-block"}' class="select">
			<el-select v-model="queryIndex">
				<el-option
				  v-for="(item,index) in queryList"
				  :key="index"
				  :label="item.queryName"
				  :value="index"
				></el-option>
			</el-select>
		</div>
		<div :style='{"margin":"0 0px 0 0","display":"inline-block"}' class="input" v-if="queryIndex==0">
			<el-input v-model="zuopinxinxizuopinleibie" placeholder="作品类别"></el-input>
		</div>
		<div :style='{"margin":"0"}' class="btn" v-if="queryIndex==0">
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 12px 0 16px","margin":"0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"2px","background":"rgba(246,77,54,1)","width":"auto","lineHeight":"32px","fontSize":"16px","height":"32px"}' type="primary" @click="search('zuopinxinxi')">
				<span class="icon iconfont icon-chakan14" :style='{"color":"rgba(255, 255, 255, 1)","margin":"0 4px 0 0","fontSize":"20px"}'></span>
				
			</el-button>
		</div>
	</div>
	<!-- 搜索 -->



		<!-- 系统简介 -->
		<div id="system" class="animate__animated" :style='{"padding":"20px 18%","margin":"0","borderColor":"#ffc652","background":"none","borderWidth":"0px 0 0","width":"100%","position":"relative","borderStyle":"solid","height":"auto","order":"5"}'>
		  <div :style='{"padding":"0","margin":"0","color":"#222","textAlign":"left","background":"none","width":"auto","fontSize":"24px","fontWeight":"600","height":"60px"}'>{{systemIntroductionDetail.title}}</div>
		  <div :style='{"margin":"0 0 30px","color":"#888","textAlign":"right","display":"none","width":"100%","lineHeight":"1.5","fontSize":"16px"}'>{{systemIntroductionDetail.subtitle}}</div>
		  <div :style='{"padding":"0 0px","margin":"0","flexWrap":"wrap","display":"block","width":"40%","float":"left","height":"236px","order":"2"}'>
		    <img :style='{"width":"100%","margin":"0 0px","objectFit":"cover","display":"block","height":"100%"}' :src="baseUrl + systemIntroductionDetail.picture1">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture2">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture3">
		  </div>
		  <div :style='{"padding":"14px 12px 0","margin":"0px 0 10px 0","overflow":"hidden","color":"rgb(102, 102, 102)","background":"#f6f6f6","width":"60%","lineHeight":"24px","fontSize":"14px","textIndent":"2em","float":"right","height":"236px","order":"2"}' v-html="systemIntroductionDetail.content"></div>
		  <div :style='{"transform":"rotate(180deg)","top":"0","background":"url(http://codegen.caihongy.cn/20230920/8a35b5134ee644b8a9a87ea99a0f1490.png) no-repeat","display":"none","width":"200px","position":"absolute","right":"52%","height":"100%"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0px solid #eccc19","cursor":"pointer","padding":"0 20px","margin":"0","textAlign":"left","display":"flex","right":"18%","justifyContent":"center","top":"16px","borderRadius":"20px","background":"linear-gradient(to right,#f67536,#f64d36),#f64d36","width":"auto","lineHeight":"36px","position":"absolute","order":"8","height":"40px"}' @click="toDetail('systemintroDetail',systemIntroductionDetail)">
		    <span :style='{"padding":"0 0px 0 0","margin":"0","color":"#fff","background":"none","display":"inline-block","width":"auto","fontSize":"15px","lineHeight":"40px","height":"40px"}'>查看更多</span>
		    <span class="icon iconfont icon-jiantou18" :style='{"padding":"0px","margin":"0","color":"#fff","background":"none","display":"inline-block","fontSize":"16px","lineHeight":"40px","height":"40px"}'></span>
		  </div>
		</div>
		<!-- 系统简介 -->
		
	<!-- 新闻资讯 -->
	<div id="animate_newsnews" class="news animate__animated" :style='{"padding":"40px 18%","margin":"0 auto","backgroundAttachment":"fixed","background":"url(http://codegen.caihongy.cn/20231004/c110df0d04d245e896879bcfb8a4503f.png) no-repeat center top / cover","width":"100%","position":"relative","order":"3"}'>
		<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
			<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>
		
		<div class="title" :style='{"width":"auto","padding":"0","margin":"0 auto","textAlign":"left","background":"none","height":"60px"}'>
			<span :style='{"color":"#222","fontSize":"24px","fontWeight":"600"}'>公告资讯</span>
		</div>
		
			
			
			<!-- 样式二 -->
		<div class="list list2 index-pv1" :style='{"padding":"0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}' v-if="newsList.length">
			<div :style='{"cursor":"pointer","margin":"0 0 30px","background":"#fff","display":"flex","width":"49%","fontSize":"0","position":"relative","height":"150px"}' v-for="(item,index) in newsList" :key="index" class="list-item animation-box" @click="toDetail('newsDetail', item)">
				<img :style='{"width":"40%","objectFit":"cover","display":"inline-block","height":"100%"}' :src="baseUrl + item.picture" alt="" />
				<div :style='{"width":"60%","padding":"10px","overflow":"hidden","display":"inline-block","height":"150px"}' class="item-info">
					<div class="name line1" :style='{"padding":"0 10px","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"30px","fontSize":"14px","textOverflow":"ellipsis","fontWeight":"600"}'>{{item.title}}</div>
					<div :style='{"padding":"0 10px","lineHeight":"24px"}'>
					  <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
					  <span class="text" :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{item.addtime}}</span>
					</div>
					<div :style='{"padding":"0 10px","display":"inline-block"}'>
					  <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666","display":"inline-block"}'></span>
					  <span class="text" :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{item.name}}</span>
					</div>
					<div :style='{"padding":"0 10px","display":"inline-block"}'>
					  <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
					  <span class="text" :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{item.thumbsupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","display":"inline-block"}'>
					  <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
					  <span class="text" :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{item.storeupnum}}</span>
					</div>
					<div :style='{"padding":"0 10px","display":"inline-block"}'>
					  <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#666"}'></span>
					  <span class="text" :style='{"color":"#666","lineHeight":"1.5","fontSize":"12px"}'>{{item.clicknum}}</span>
					</div>
				</div>
			</div>
		</div>
			
			
			
			
			
			
			
			
		











		<div @click="moreBtn('news')" :style='{"border":"0px solid #eccc19","cursor":"pointer","padding":"0 20px","margin":"0","textAlign":"center","display":"block","right":"18%","top":"40px","borderRadius":"20px","background":"linear-gradient(to right,#f67536,#f64d36),#f64d36","width":"auto","lineHeight":"32px","position":"absolute"}'>
			<span :style='{"color":"#fff","fontSize":"15px"}'>查看更多</span>
			<i :style='{"color":"#fff","fontSize":"16px","display":"inline-block"}' class="icon iconfont icon-jiantou18"></i>
		</div>
		
		</div>
	<!-- 新闻资讯 -->


<!-- 商品推荐 -->
<div id="animate_recommendzuopinxinxi" class="recommend animate__animated" :style='{"padding":"40px 18% 40px","margin":"0 auto","borderColor":"#ddd","background":"#f7f6f4","borderWidth":"0px 0","width":"100%","position":"relative","borderStyle":"solid","order":"2"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"100%","margin":"0 auto","textAlign":"left","background":"none","height":"60px"}'>
		<span :style='{"padding":"0px 0 0","fontSize":"24px","color":"#222","fontWeight":"600","display":"block"}'>作品信息推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	







		<div v-if="zuopinxinxiRecommend.length" :style='{"padding":"0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}' class="list list17 index-pv1">
		  <div v-for="item,index in zuopinxinxiRecommend" :key="index"  @click="toDetail('zuopinxinxiDetail', item)" :style='{"cursor":"pointer","width":"18%","margin":"20px 0","position":"relative","background":"none","height":"auto"}' class="item">
				<img class="image" v-if="preHttp(item.zuopinfengmian)" :src="item.zuopinfengmian.split(',')[0]" alt="" />
				<img class="image" v-else :src="baseUrl + (item.zuopinfengmian?item.zuopinfengmian.split(',')[0]:'')" alt="" />
			<div class="content">
		      <div :style='{"lineHeight":"24px","fontSize":"14px","color":"#333","display":"none"}'>{{item.zuopintuiwen}}</div>

		      <div class="info">
				<div :style='{"overflow":"hidden","whiteSpace":"hidden","color":"#333","textAlign":"center","width":"100%","lineHeight":"1.5","fontSize":"16px","textOverflow":"ellipsis","fontWeight":"600"}' class="name ">{{item.zuopinmingcheng}}</div>
				<div :style='{"overflow":"hidden","whiteSpace":"hidden","color":"#333","textAlign":"center","width":"100%","lineHeight":"1.5","fontSize":"16px","textOverflow":"ellipsis","fontWeight":"600"}' class="name ">{{item.yonghuming}}</div>
				<div :style='{"padding":"0","display":"none"}'>
		          <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#fff"}'></span>
		          <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"12px"}'>{{item.addtime}}</span>
		        </div>
		        <div :style='{"padding":"0","display":"none"}'>
		          <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#fff"}'></span>
		          <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"12px"}'>{{item.yonghuming}}</span>
		        </div>
		        <div :style='{"padding":"0","display":"none"}'>
		          <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#fff"}'></span>
		          <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"12px"}'>{{item.thumbsupnum}}</span>
		        </div>
		        <div :style='{"padding":"0","display":"none"}'>
		          <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#fff"}'></span>
		          <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"12px"}'>{{item.storeupnum}}</span>
		        </div>
		        <div :style='{"padding":"0","display":"none"}'>
		          <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"12px","color":"#fff"}'></span>
		          <span :style='{"color":"#fff","lineHeight":"1.5","fontSize":"12px"}'>{{item.clicknum}}</span>
		        </div>
		      </div>
		    </div>
		  </div>
		</div>
	
	<div @click="moreBtn('zuopinxinxi')" :style='{"border":"0px solid #eccc19","cursor":"pointer","padding":"0 20px","margin":"0","textAlign":"center","display":"block","right":"18%","top":"40px","borderRadius":"20px","background":"linear-gradient(to right,#f67536,#f64d36),#f64d36","width":"auto","lineHeight":"32px","position":"absolute"}'>
		<span :style='{"color":"#fff","fontSize":"15px"}'>查看更多</span>
		<i :style='{"color":"#fff","fontSize":"16px","display":"inline-block"}' class="icon iconfont icon-jiantou18"></i>
	</div>
	
</div>
<!-- 商品推荐 -->

	
	<!-- 在线留言 -->
	<div id="msgs" class="msg animate__animated" :style='{"padding":"20px 0","margin":"0 auto","borderColor":"#1d800130","background":"url(http://codegen.caihongy.cn/20231004/fbe463f03c124bafbedf8958afed5b8d.jpg) no-repeat center top / cover","borderWidth":"0px 0 0","width":"100%","position":"relative","borderStyle":"solid","order":"11","height":"auto"}'>
	  <img :style='{"width":"100%","objectFit":"cover","display":"none","height":"400px"}' src="https://codegen.caihongy.cn/20220719/a6774084daa04dcdb140ce097ee4e4df.jpg">
	  <div :style='{"padding":"0 18%","background":"rgba(0,0,0,.0)","display":"block","width":"100%","justifyContent":"space-between","height":"100%","zIndex":"1"}'>
	    <div :style='{"width":"50%","float":"right","padding":"20px 30px"}'>
	      <div :style='{"margin":"0 0 10px","fontSize":"14px","lineHeight":"1.5","color":"#333","display":"none"}'>MESSAGE</div>
	      <div :style='{"margin":"0 0 10px","fontSize":"24px","lineHeight":"1.5","color":"#333","fontWeight":"600"}'>在线留言</div>
	      <div :style='{"margin":"0 0 10px","fontSize":"14px","lineHeight":"1.5","color":"#666"}'>描述1描述1描述1描述1描述1描述1描述1描述1描述1描述1</div>
	      <div :style='{"margin":"0 0 10px","fontSize":"14px","lineHeight":"1.5","color":"#666"}'>描述2描述2描述2</div>
	      <div :style='{"display":"none"}'>
	        <span class="icon iconfont icon-dianpu" :style='{"margin":"0 5px 0","fontSize":"16px","lineHeight":"1.5","color":"#fff"}'></span>
	        <div :style='{"color":"#fff","fontSize":"16px","lineHeight":"1.5"}'>0753-1234567</div>
	      </div>
	    </div>
	    <div :style='{"width":"50%","padding":"0","float":"left","background":"rgba(255,255,255,.5)"}'>
	      <el-form ref="messageForm" autocomplete="off" :model="messageForm" :rules="messageRules" :style='{"width":"100%","padding":"20px","background":"none","height":"100%"}'>
	        <el-form-item class="input" :style='{"width":"100%","margin":"0"}' prop="name">
	          <el-input type="text" v-model="messageForm.name" placeholder="请输入姓名" />
	        </el-form-item>
	        <el-form-item class="input" :style='{"width":"100%","margin":"0"}' prop="email">
	          <el-input type="text" v-model="messageForm.email" placeholder="请输入邮箱" />
	        </el-form-item>
	        <el-form-item class="input" :style='{"width":"100%","margin":"0"}' prop="mobile">
	          <el-input type="text" v-model="messageForm.mobile" placeholder="请输入电话" />
	        </el-form-item>
	        <el-form-item class="textarea" :style='{"width":"100%","margin":"0"}' prop="content">
	          <el-input type="textarea" v-model="messageForm.content" placeholder="请输入留言" />
	        </el-form-item>
	        <el-form-item class="btn" :style='{"width":"100%","textAlign":"left","margin":"0"}'>
	          <el-button :style='{"cursor":"pointer","border":"0px solid #eccc19","padding":"0px 10px","boxShadow":"0px 0px 0px #ccc","margin":"20px auto","color":"#fff","borderRadius":"20px","background":"linear-gradient(to right,#f67536,#f64d36),#f64d36","width":"120px","fontSize":"16px","lineHeight":"40px","height":"40px"}' @click="messageSave">提交</el-button>
	        </el-form-item>
	      </el-form>
	    </div>
	  </div>
	</div>
	<!-- 在线留言 -->
	<!-- 友链 -->
	<div id="friendly" class="friendly animate__animated" :style='{"padding":"0px 18%","margin":"0px auto 0","borderColor":"#ededed","background":"#fff","borderWidth":"0px 0 0","width":"100%","borderStyle":"solid","height":"auto","order":"12"}'>
	  <div :style='{"borderColor":"#ddd","margin":"20px auto 0","textAlign":"left","borderWidth":"0 0 0px","width":"100%","borderStyle":"solid","height":"auto"}'>
	    <div :style='{"padding":"0 0px","borderColor":"rgba(64, 158, 255)","margin":"0 0 -1px 0","color":"#333","borderWidth":"0 0 0px","display":"inline-block","lineHeight":"40px","fontSize":"24px","borderStyle":"solid","fontWeight":"600"}'>友情链接</div>
	  </div>
	  <div :style='{"width":"100%","padding":"10px 0","flexWrap":"wrap","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","margin":"0 20px 20px 0","alignItems":"center","flexDirection":"column","display":"flex","width":"auto","justifyContent":"center","height":"auto"}' v-for="item in friendLinkList" :key="item.id" @click="friendlinkClick(item.url)">
	      <img :style='{"border":"1px solid #eee","padding":"10px","margin":"0 auto","objectFit":"contain","borderRadius":"0px","background":"#fff","display":"none","width":"100%","height":"100%"}' :src="item.picture?(baseUrl + item.picture.split(',')[0]): ''" alt="">
	      <div :style='{"overflow":"hidden","whiteSpace":"nowrap","color":"#666","textAlign":"center","width":"100%","lineHeight":"30px","fontSize":"16px","textOverflow":"ellipsis"}'>{{item.name}}</div>
	    </div>
	  </div>
	</div>
	<!-- 友链 -->
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        systemIntroductionDetail: {},
        queryList:[
          {
              queryName:"作品类别",
          },
        ],
        queryIndex: 0,
        zuopinxinxizuopinleibie: '',
        newsList: [],
        zuopinxinxiRecommend: [],





		friendLinkList: [],
		messageForm: {},
		messageRules:{
			name:[{ required: true, message: '姓名不能为空', trigger: 'blur' },],
			email:[{ required: true, message: '邮箱不能为空', trigger: 'blur' },{ validator: this.$validate.isEmail, trigger: 'blur' }],
			mobile:[{ required: true, message: '手机号不能为空', trigger: 'blur' },{ validator: this.$validate.isMobile, trigger: 'blur' }],
			content:[{ required: true, message: '留言内容不能为空', trigger: 'blur' },],
		},
      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getSystemIntroduction();
		this.getList();
		this.getFriendLinkList()
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			setTimeout(()=>{
			},750)
		},
		messageSave(){
			this.$refs["messageForm"].validate(valid => {
				if(valid) {
					this.$http.post('onlinemessage/save', this.messageForm).then(res => {
						if(res.data.code == 0) {
							this.$message({
								message: '提交成功',
								type: 'success',
								duration: 1500,
								onClose: () => {
									this.messageForm = {}
									this.$forceUpdate()
								}
							});
						}
					})
				}
			})
		},
		// 获取友链列表
		getFriendLinkList(){
			this.$http.get('friendlink/list', {params:{page: 1,limit: 100}}).then(res => {
			  if(res.data.code == 0) {
			    this.friendLinkList = res.data.data.list
			  }
			})
		},
		// 友链跳转
		friendlinkClick(url){
			if(url){
				window.open(url)
			}
		},


		handleScroll() {
			let arr = [
				{id:'search',css:'animate__fadeInUp'},
				{id:'about',css:'animate__'},
				{id:'system',css:'animate__'},
				{id:'animate_recommendzuopinxinxi',css:'animate__'},
				{id:'animate_newsnews',css:'animate__'},
				{id:'msgs',css:'animate__'},
				{id:'friendly',css:'animate__'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
      search(tablename) {
        if (this.queryIndex == 0 && this.zuopinxinxizuopinleibie) {
          this.$router.push({path: '/index/' + tablename, query: {indexQueryCondition: this.zuopinxinxizuopinleibie}});
        }
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 4,
                sort: 'addtime',
				order: 'desc'
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "zuopinxinxi/autoSort";
			data = {
				page: 1,
				limit: 5,
			}
			data['sfsh'] = '是'
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.zuopinxinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select ::v-deep .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 2px;
			padding: 0 30px 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 180px;
			font-size: 14px;
			height: 32px;
		}
		
		.search .input ::v-deep .el-input__inner {
			border-radius: 2px;
			padding: 0 10px;
			color: rgba(64, 158, 255, 1);
			width: 280px;
			font-size: 14px;
			border-color: #ddd;
			border-width: 1px;
			border-style: solid;
			height: 32px;
		}
		// -------- search --------
		// 在线留言
		.msg .input ::v-deep .el-input__inner {
			border-radius: 0px;
			padding: 0 10px;
			color: #666;
			background: #fff;
			width: 100%;
			font-size: 14px;
			border-color: #eee;
			border-width: 0 0 1px;
			border-style: solid;
			height: 40px;
		}
		.msg .el-textarea ::v-deep .el-textarea__inner {
			border: 0px solid #1d800120;
			border-radius: 0px;
			padding: 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: #666;
			width: 100%;
			font-size: 14px;
			line-height: 1.5;
			height: 100px;
			}
		// 在线留言
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				box-shadow: 0px 0px 0px 0px #e7e7e7;
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(0.98) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	








	.home-preview .recommend .list17 .item .image {
				border-radius: 8px 8px 0 0;
				object-fit: cover;
				display: block;
				width: 100%;
				transition: 0.3s;
				height: 280px;
			}

	.home-preview .recommend .list17 .item:hover .image {
				transform: scale(1);
			}
	
	.home-preview .recommend .list17 .item .content {
				border-radius: 0 0 8px 8px;
				padding: 10px 0;
				left: 0;
				bottom: 0;
				background: #fff;
				display: flex;
				width: 100%;
				position: inherit;
				transition: 0.3s;
				height: auto;
			}
	
	.home-preview .recommend .list17 .item:hover .content {
				bottom: 0;
			}


	.home-preview .lists .list17 .item .image {
				border-radius: 8px;
				object-fit: cover;
				display: block;
				width: 100%;
				transition: 0.3s;
				height: 100%;
			}

	.home-preview .lists .list17 .item:hover .image {
				transform: scale(1);
			}
	
	.home-preview .lists .list17 .item .content {
				border-radius: 0 0 8px 8px;
				padding: 5px 10px;
				overflow: hidden;
				left: 0;
				bottom: 0px;
				background: rgba(0,0,0,.2);
				display: flex;
				width: 100%;
				align-items: center;
				position: absolute;
				transition: 0.3s;
				height: auto;
			}
	
	.home-preview .lists .list17 .item:hover .content {
				bottom: 0;
			}
</style>
