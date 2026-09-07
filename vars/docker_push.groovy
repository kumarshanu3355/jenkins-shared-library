def call(String imgname, String imgtag,String dockeruserid){
  withCredentials([usernamePassword(credentialId: "dockercred", usernameVariable: "dockeruser", passwordVariable: "dockerpass")]){
    sh "echo ${dockerpass} | docker login -u ${dockeruser} --password-stdin"
    sh "docker tag ${imgname}:${imgtag} ${dockeruserid}/${imgname}:${imgtag}"
    sh "docker push ${dockeruserid}/${imgname}:${imgtag}"
    
  }

}
