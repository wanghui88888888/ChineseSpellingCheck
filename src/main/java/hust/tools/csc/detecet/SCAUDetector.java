package hust.tools.csc.detecet;

import hust.tools.csc.util.Sentence;

/**
 *<ul>
 *<li>Description: 由SCAU提出的基于n元模型的中文拼写检测器 
 *<li>Company: HUST
 *<li>@author Sonly
 *<li>Date: 2017年10月18日
 *</ul>
 */
public class SCAUDetector extends AbstractDetector {

	public SCAUDetector(Sentence sentence) {
		super(sentence);
	}

	@Override
	public DetectResult detect(Sentence sentence) {
		return null;
	}

	/**
	 * 返回句子分词后的词串
	 * @param sentence	待分词的句子
	 * @return			分词后的词串
	 */
	public String[] wordSegment(Sentence sentence) {
		return null;
	}

	@Override
	public double scoreSentence(Sentence sentence) {
		return 0;
	}
	
	@Override
	public void sort() {
		
	}

	@Override
	public String[] getErrorCharacter() {
		return null;
	}

	@Override
	public int[] getErrorLocation() {
		return null;
	}
}
