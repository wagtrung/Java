bubble sort

Int[] array = {42, 16, 666, 15, 8, 777, 4, 108, 23};



public static void BubbleSort(int a[],int n)
	{
		int temp;
		boolean swap;
		for(int i=0;i<n-1;i++)
		{
			swap=false;
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[(j+1)])
				{
					temp=a[j];
					a[j]=a[(j+1)];
					a[(j+1)]=temp;
					swap=true;
				}
			//System.out.print(a[j]);
			}
			//System.out.println();
			if(swap==false)
				break;
		}
		print(a,n);
	}


for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    Integer greaterElement = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = greaterElement;
                }
            }
        }

        for (Integer i : array) {
            System.out.print(i + " ");
        }






public static void SelectionSort(int a[], int n)
	{
		for (int i=0;i<n-1;i++)
		{
			int imin=i;
			int temp;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[imin])
					imin=j;
			}
					temp=a[i];
					a[i]=a[imin];
					a[imin]=temp;
		}
		
	}


public static void InsertionSort(int a[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int val=a[i];
			int hole=i;
			while(hole>0&&a[hole-1]>val)
			{
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=val;
		}
		
	}



public static void MergeSort(int a[],int n)
	{
		
		if(n<=1)
			return;
		int mid=n/2;
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		for(int i=0;i<mid;i++)
			left[i]=a[i];
		for(int i=mid;i<n;i++)
			right[i-mid]=a[i];
		MergeSort(left,mid);
		MergeSort(right,n-mid);
		Merge(left,right,a);
		
	}
	public static void Merge(int left[],int right[],int a[])
	{
		int nL=left.length;
		int nR=right.length;
		int i,j,k;
		i=j=k=0;
		while(i<nL&&j<nR)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
				k++;
			}
			else
			{
				a[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<nL)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<nR)
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}

