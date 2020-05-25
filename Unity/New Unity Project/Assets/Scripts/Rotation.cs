using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Rotation : MonoBehaviour
{  
    private float velocity = 0;
    // Start is called before the first frame update
    void Start()
    {
        
    }
	// Update is called once per frame
	void Update () {

        transform.Rotate(Vector3.forward * 100f * Time.deltaTime * velocity);

	}

    public void setVelocity(float value)
    {
        velocity = value;
    }
}
