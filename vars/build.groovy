def call(String imgname, String imgtag){
  sh "docker build -t ${imgname}:${imgtag} ."
}
