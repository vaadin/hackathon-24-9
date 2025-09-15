# hackathon-24-9 (manolo)

## Vaadin Plugins Updates

I tested the new **Vaadin Plugin for Eclipse**.
It worked fine, except that there were no options for setting the `groupId` of a new Vaadin project, unlike in other new-project wizards such as the Maven new project one.

This feature was also missing in **IntelliJ** and **VS Code**. There was already a ticket requesting it, which I had opened a couple of days ago:
- [when creating a project with IDE plugin allow  setting groupId](https://github.com/vaadin/copilot/issues/96)

### Implemented Features
I implemented the feature in all three plugins:
- [PR for VS Code Plugin](https://github.com/vaadin/vscode-plugin/pull/52/files)
- [PR for IntelliJ Plugin](https://github.com/vaadin/intellij-plugin/pull/454/files)
- [PR for Eclipse Plugin](https://github.com/vaadin/eclipse-plugin/pull/59/files)

Additionally, I aligned the plugins so that:
- Default values are `projectName = "NewProject"` and `groupId = "com.example.application"`.
- Also, now validation rules for both fields are consistent across plugins.
   - Name must have only letters/digits/underscores/hyphens/dots
   - Group ID must be a valid Java package

### Endpoint Fix for start.vaadin.com
I also realized that the **Start** endpoint for HelloWorld projects was not handling custom `artifactId` and `groupId` correctly, downloading the original skeleton from github instead of customizing it.

I submitted a PR to fix this issue:
- [PR for Start](https://github.com/vaadin/start/pull/3448/files)


