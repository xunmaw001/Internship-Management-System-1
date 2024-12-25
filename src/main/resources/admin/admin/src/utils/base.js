const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootrij2p/",
            name: "springbootrij2p",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootrij2p/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "实习管理系统"
        } 
    }
}
export default base
