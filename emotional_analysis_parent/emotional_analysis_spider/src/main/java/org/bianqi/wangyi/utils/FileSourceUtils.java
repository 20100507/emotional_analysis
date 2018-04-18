package org.bianqi.wangyi.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 写入文件
 * <p>Title: FileSourceUtils</p>
 * <p>Description: </p>
 * <p>School: qiqihar university</p> 
 * @author	BQ
 * @date	2018年2月2日下午2:55:15
 * @version 1.0.0
 */
public class FileSourceUtils {
	
	private File file = null;
	private AtomicInteger i = new AtomicInteger(1);
	
	public void importData(String data, String fileName) throws Exception {
		System.out.println("开始写数据喽~~~~~~~~");
		synchronized (FileSourceUtils.class) {
			file = new File(fileName + i.get() + ".dat");
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (file.length() > 52428800L) {
				file = new File(fileName + i.get() + ".dat");
				i.incrementAndGet();
			}
			writeFileContent(file, data);
		}
	}
	
	public static boolean writeFileContent(File file,String newstr) throws IOException{
		synchronized (FileSourceUtils.class) {
			 Boolean bool = false;
		        String filein = newstr+"\r\n";//新写入的行，换行
		        String temp  = "";
		        FileInputStream fis = null;
		        InputStreamReader isr = null;
		        BufferedReader br = null;
		        FileOutputStream fos  = null;
		        PrintWriter pw = null;
		        try {
		            //将文件读入输入流
		            fis = new FileInputStream(file);
		            isr = new InputStreamReader(fis);
		            br = new BufferedReader(isr);
		            StringBuffer buffer = new StringBuffer();
		            //文件原有内容
		            for(int i=0;(temp =br.readLine())!=null;i++){
		                buffer.append(temp);
		                // 行与行之间的分隔符 相当于“\n”
		                buffer = buffer.append(System.getProperty("line.separator"));
		            }
		            buffer.append(filein);
		            fos = new FileOutputStream(file);
		            pw = new PrintWriter(fos);
		            pw.write(buffer.toString().toCharArray());
		            pw.flush();
		            bool = true;
		        } catch (Exception e) {
		            e.printStackTrace();
		        }finally {
		            //不要忘记关闭
		            if (pw != null) {
		                pw.close();
		            }
		            if (fos != null) {
		                fos.close();
		            }
		            if (br != null) {
		                br.close();
		            }
		            if (isr != null) {
		                isr.close();
		            }
		            if (fis != null) {
		                fis.close();
		            }
		        }
		        return bool;
		}
    }
}
