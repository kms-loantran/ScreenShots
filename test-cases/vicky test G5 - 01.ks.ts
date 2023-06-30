import katalon from "@katalon-studio/cloud-test";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.verifyElementVisible(
    {
      type: "Web",
      id: "bc65b0c0-6cd3-4234-8d01-d1cf8874f3a5",
      attributes: {
        id: "btn-make-appointment",
        href: "./index.php#appointment",
        class: "btn btn-dark btn-lg",
      },
      childIndex: 4,
      hashes: { "md5.v1": "3caec008087ccb7a1cb3fc698fbf83c2" },
      name: "a - Make Appointment",
      selectors: [
        {
          id: "62e49702-7788-4fcd-88fe-395835129b0e",
          type: "CSS",
          value: "#btn-make-appointment",
          isDefault: true,
        },
        {
          id: "8d9cecd2-6799-4194-ae26-97e80690d3b4",
          type: "Attribute",
          value: null,
          isDefault: true,
        },
      ],
      selectorType: "CSS",
      tag: "a",
      text: "Make Appointment",
      pageUrl: "https://katalon-demo-cura.herokuapp.com/",
      parentIframe: null,
      shadowRoot: null,
    },
    ""
  );
  await web.click({
    type: "Web",
    id: "bc65b0c0-6cd3-4234-8d01-d1cf8874f3a5",
    attributes: {
      id: "btn-make-appointment",
      href: "./index.php#appointment",
      class: "btn btn-dark btn-lg",
    },
    childIndex: 4,
    hashes: { "md5.v1": "3caec008087ccb7a1cb3fc698fbf83c2" },
    name: "a - Make Appointment",
    selectors: [
      {
        id: "62e49702-7788-4fcd-88fe-395835129b0e",
        type: "CSS",
        value: "#btn-make-appointment",
        isDefault: true,
      },
      {
        id: "8d9cecd2-6799-4194-ae26-97e80690d3b4",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "Make Appointment",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
});