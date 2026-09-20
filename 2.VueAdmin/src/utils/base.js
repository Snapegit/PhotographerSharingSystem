const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot6k0721ru/",
            name: "springboot6k0721ru",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot6k0721ru/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "摄影师分享交流社区"
        } 
    }
}
export default base
