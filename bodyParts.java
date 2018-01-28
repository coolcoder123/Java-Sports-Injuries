
public class bodyParts{
	private boolean ache=false;
	private boolean painful=false;
	private boolean sharp=false;
	private Profile person;
	private String part;
	private String d1;
	private String d2;
	private String d3;
	private String diagnosis;
	
	public bodyParts(Profile prsn, String area){
		person = prsn;
		part = area;
		switch (person.getPain()){
			case 1: ache=true;
					break;
			case 2: painful=true;
					break;
			case 3: sharp=true;
					break;
		}

	}
	public String arm(){
			if (ache) {
				d1 = "Perhaps your arm might have been strained. Rest or ice would be beneficial for your arms, but proper throwing/catching technique would be beneficial in the long run";
				d2 = "Perhaps your elbow is sprained. A way to treat this is by doing physical therapy, which can circulate blood through the elbow";
				d3 = "None";
			}
			else if(painful) {
				d1 = "Perhaps your arm has been hit by another player or something else. Ice would help the most to reduce any swelling and pain.";
				d2 = "Perhaps you have pulled a muscle. A way to treat this is with ice, rest, compression, and elevation to reduce swelling and pain. Do NOT strain your arm until the pain has improved significantly.";
				d3 = "Perhaps your hand is fractured. Ice should be applied immediately after injury, and the arm should be moved as much as possible to prevent it from stiffening up.";
			}	
			else if(sharp) {
				d1 = "Perhaps you have torn a muscle in your arm. This requires immediate medical attention, but ice would help lower the pain and swelling in the short term.";
				d2 = "Perhaps you have a fractured bone. This requires immediate medical attention, but ice can lower the pain/swelling but be gentle on contact";
				d3 = "Perhaps you have dislocated a bone, like your elbow. This is a medical emergency and must be brought to medical attention. Ice might lower the pain/swelling, but DO NOT attempt to reset the bone without a professional.";
			}
			
		return "Diagnosis 1: " + d1 + "\nDiagnosis 2: " + d2 + "\nDiagnosis 3: " + d3;
			
	}
	public String head(){
		if (ache) {
			d1 = "Headaches from football can be a sign of a possible concussion. Concussions are MEDICAL EMERGENCY and you MUST get medical attention, or you might lose your life.";
		    d2 = "Perhaps you are dehydrated, which can cause headaches. To remedy this, drink pleny of fluids.";
			d3 = "Some headaches might stem from stress. The way to cure this is to calm down at games and to practice stress-relieving activities.";
		}
		else if(painful) {
			d1 = "Perhaps you have sustained an impact to the head. Ice will lower the swelling and the pain, but it would be smart to check for signs of a concussion if it was a hard blow.";
			d2 = "Perhaps you have experienced whiplash, where your head snaps forward or backwards quickly, causing strain on your neck and head. This can lead to a concussion as well, so get checked at a hospital if it is painful enough";
			d3 = "Perhaps you have a hemorrhage. A medical scan will be necessary and if there is a large amount of bleeding, surgery may need to be done.";
		}	
		else if(sharp) {
			d1 = "Perhaps you are experiencing \'ice pick headaches\', which makes you feel like an ice pick has stabbed your head. This can arise from concussions, and a doctor may allieviate your pain.";
			d2 = "Migranes can cause sharp pains in the head. If the pain gets too harsh, a doctor can prescribe you a medication";
			d3 = "Perhaps you have dislocated a bone, like your elbow. This is a medical emergency and must be brought to medical attention. Ice might lower the pain/swelling, but DO NOT attempt to reset the bone without a professional.";
		}
		
		return "Diagnosis 1: " + d1 + "\nDiagnosis 2: " + d2 + "\nDiagnosis 3: " + d3;
		
	}
	public String leg(){
		if (ache) {
			d1 = "Perhaps you have a knee injury. Rest is necessary to prevent further injury to the weakest parts of the knee";
			d2 = "Perhaps your achilles is ruptured. Though it isn't necessary to stop all physical activity, it should be reduced to prevent further injury.";
			d3 = "Perhaps you have an ankle sprain. Putting ice on the ankle, but with a thin piece of cloth between, will reduce swelling";
		}
		else if(painful) {
			d1 = "Perhaps you have a shin split. Rest is necessary to prevent further injury.";
			d2 = "Perhaps you have iliotibial leg pain, Ret is necessary to heal the iliotibial band.";
			d3 = "Perhaps you have a leg cramp. Adequate hydration is necessary to heal leg cramps.";
		}	
		else if(sharp) {
			d1 = "Perhaps you pulled a hamstring. Resting for two to three weeks is necessary to prevent further injury.";
			d2 = "Perhaps your big toe is dislocated. Rest, ice, compression, and elevation above heart level are necesary for recovery.  ";
			d3 = "Perhaps you have strained your groin. Rest, ice, compression, and elevation are the best methods for immediate reovery.";
		}
		
		return "Diagnosis 1: " + d1 + "\nDiagnosis 2: " + d2 + "\nDiagnosis 3: " + d3;
	
	}
	public String torso(){
		if (ache) {
			d1 = "Perhaps your abdominal muscle is bruised. Rest and ice will help ease pain and reduce bleeding and swelling.";
			d2 = "Perhaps your ribs are bruised. Rest is necessary to allow the tissues to heal.";
			d3 = "Perhaps your chest is in pain. A massage will release tension in muscles and reduce pressure on any nerves that are possibly causing the pain.";
		}
		else if(painful) {
			d1 = "Perhaps your arm has been hit by another player or something else. Ice would help the most to reduce any swelling and pain.";
			d2 = "Perhaps you have pulled a muscle. A way to treat this is with ice, rest, compression, and elevation to reduce swelling and pain. Do NOT strain your arm until the pain has improved significantly.";
			d3 = "Perhaps your pecs are strained. Ice, rest, compression, and elevation should be applied for the first two days.";
		}	
		else if(sharp) {
			d1 = "If you were hit directly on the chest, you might have fractured your ribs. This can lead to stabbing pain, painful of breathing. Broken ribs can heal on their own by 6 weeks, but a doctor can prescribe pain medication to make it easier for you.";
			d2 = "If you were hit very hard on the back (potentially by multiple people) you might have damaged your spine. Spinal damage is excruciating and often leads to paralysis. While doctors can keep you alive, they have no knowledge of how to reverse the spinal damage.";
			d3 = "While not as easy to do, getting hit hard on the hips can lead to a hip fracture. This can cause sharp pain and leave you unable to stand, and is treated by surgery ranging from screws to total hip replacement.";
		}
	
		return "Diagnosis 1: " + d1 + "\nDiagnosis 2: " + d2 + "\nDiagnosis 3: " + d3;
	
	}
	public String shoulder(){
		if (ache) {
			d1 = "Perhaps your arm might have been strained. Rest or ice would be beneficial for your arms, but proper throwing/catching technique would be beneficial in the long run";
			d2 = "Perhaps your labrum is torn. Rest and physical therapy are necessary for recovery.";
			d3 = "Perhaps you have a shoulder cuff injury. The shoulder should be protected and phyical therapy must be done for optimal recovery.";
		}
		else if(painful) {
			d1 = "Perhaps your arm has been hit by another player or something else. Ice would help the most to reduce any swelling and pain.";
			d2 = "Perhaps you have pulled a muscle. A way to treat this is with ice, rest, compression, and elevation to reduce swelling and pain. Do NOT strain your arm until the pain has improved significantly.";
			d3 = "Perhaps your shoulder has been dislocated. Ice can help reduce swelling.";
		}	
		else if(sharp) {
			d1 = "Perhaps your shoulder has been separated. Rest and ice will reduce swelling and allow the tissues to heal.";
			d2 = "Perhaps you have a fractured bone. This requires immediate medical attention, but ice can lower the pain/swelling but be gentle on contact";
			d3 = "Perhaps you have dislocated a bone, like your elbow. This is a medical emergency and must be brought to medical attention. Ice might lower the pain/swelling, but DO NOT attempt to reset the bone without a professional.";
		}
	
		return "Diagnosis 1: " + d1 + "\nDiagnosis 2: " + d2 + "\nDiagnosis 3: " + d3;
	
	}
	public String runDiagnostic() {
		switch (part){
			case "arm": diagnosis=this.arm();
						break;
			case "leg": diagnosis=this.leg();
						break;
			case "torso": diagnosis=this.torso();
						  break;
			case "head":diagnosis=this.head();
						break;
			case "shoulder":diagnosis=this.shoulder();
							break;
		}
		return diagnosis;
	}
		
	
}
