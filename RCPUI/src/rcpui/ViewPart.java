package rcpui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import rcpservice.DoSomething;

public class ViewPart {

	public ViewPart() {
		// TODO Auto-generated constructor stub
	}

	public void createPartControl(Composite parent) {
		
		
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
//		Composite textComposite = new Composite(composite, SWT.BORDER);
//		textComposite.setLayoutData(GridDataFactory.swtDefaults().grab(true, true).span(2, 1).align(SWT.FILL, SWT.FILL).create());
//		textComposite.setLayout(new FillLayout());
				
		Label label = new Label(composite, SWT.NONE);
		label.setText("If you push this button, you will see an output in stacktrace");
		label.setLayoutData(new GridData());
		
//		Text text = new Text(composite, SWT.BORDER);
//		text.setLayoutData(GridDataFactory.swtDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).create());
//		text.setText("This is special text which means it is special");

		Button pushButton = new Button(composite, SWT.NONE);
		pushButton.setLocation(50, 50);
		pushButton.setText("Push a Button");

		DoSomething print = new DoSomething();
		pushButton.pack();
		pushButton.addListener(SWT.Selection, new Listener()
		
		{
			@Override
			public void handleEvent(Event event) {				
				print.printOutput();
			}
		});
	}

	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
