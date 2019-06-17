  <p>
  版本
  2017年统计用区划代码和城乡划分代码(截止2017年10月31日)
  </p>
  <p>来源
  [国家统计局](http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2017/index.html)
  </p>
  <p>
  数据共：720988条,精确到委员会
  </p>
  <p>
  使用方法
  1、解压元数据area.7z
```java
    String readString  = FileUtils.readFileToString(new File("area.json"), StandardCharsets.UTF_16LE);
	List<AreaModel> ls = JSON.parseArray(readString, AreaModel.class);
	//do it 
```
  </p>