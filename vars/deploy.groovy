def call(String imgname, String imgtag, String port, String contname){
  sh "docker stop ${contname} | true"
  sh "docker rm ${contname} | true"
  sh "docker run -d -p ${port}:${port} --name ${contname} ${imgname}:${imgtag}"
}
